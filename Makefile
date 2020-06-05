.PHONY: version install uberjar clean

VERS != clojure -e '(-> (slurp "project.clj") read-string (nth 2) println)'

version:
	echo ${VERS}

install:
	lein uberjar && lein clojupyter install --ident clojupyter-leaflet.${VERS} \
																					--jarfile target/clj-leaflet-${VERS}-standalone.jar

uberjar:
	lein uberjar

clean:
	lein clean
