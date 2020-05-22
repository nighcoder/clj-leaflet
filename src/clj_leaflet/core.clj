(ns clj-leaflet.core
  (:require [clojure.data.json :as json]
            [clojure.java.io :as io]))

(def SPECS (-> "leaflet-schema.json"
               io/resource
               slurp
               json/read-str))

(def BASE-MAPS
  (let [base-maps (json/read-str (slurp "./resources/basemaps.json"))
        k-maps (for [[outer-key v] base-maps
                     [inner-key vv] v]
                 {(csk/->kebab-case-keyword (str outer-key inner-key)) vv})]
    (reduce merge k-maps)))

(defn def-widget
  [{attributes "attributes"}]
  (reduce merge
    (for [{name "name" default "default" type "type"} attributes]
      {(keyword name) (if (= type "reference") nil default)})))

(defn make-widget
  [spec]
  (fn constructor
    ([] (constructor {}))
    ([state]
     (let [d-state (def-widget spec)
           state (merge d-state state)
           target "jupyter.widget"
           {jup :jup req-msg :req-message} (st/current-context)
           id (u/uuid)
           v-keys (set (keys d-state))]
       (ca/create-and-insert jup req-msg target id v-keys state)))))

(for [{n "name" :as spec} SPECS]
  (eval `(def ~(symbol n) ~(make-widget spec))))
