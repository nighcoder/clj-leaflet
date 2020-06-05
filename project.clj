(defproject clj-leaflet "0.1.0-SNAPSHOT"
  :description             "Map widget models for clojupyter"

  :url                     "https://github.com/nighcoder/clj-leaflet.git"

  :licence                 {:name "MIT"
                            :url "./LICENCE.md"}

  :repl-options            {:init-ns clj-leaflet.core}
  :main                    clojupyter.kernel.core
  :plugins                 [[lein-tools-deps "0.4.5"]]
  :middleware              [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config  {:config-files [:install :user :project]}
  :aliases                 {"clojupyter" ["run" "-m" "clojupyter.cmdline"]})
