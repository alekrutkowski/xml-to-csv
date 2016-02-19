(ns xml-to-csv.core
  (:require
   [clojure.java.io :as io]
   [clojure.data.csv :as csv]
   [clojure.java.io :as io]
   [clojure.data.xml :as xml])
  (:gen-class :main true))


(defn tagstr-val
  ([data]
   (tagstr-val data nil))
  ([data parent-tag]
   (if (seq? data)
     (pmap #(tagstr-val % (name parent-tag))
           data)
     (if (map? data)
       (let [{:keys [tag attrs content]} data]
         [(str parent-tag "|" (name tag) "|attr") (str attrs)
          (tagstr-val content (str parent-tag "|" (name tag)))])
       [(str parent-tag "|") data]))))


(defn save [filename data]
  (with-open
    [out-file (io/writer filename)]
    (csv/write-csv out-file data)))

(defn -main
  [filename]
  (do
    (println "Starting to convert" filename "to"
             (str filename ".csv") "...")
    (->>
     filename
     (java.io.FileInputStream.)
     xml/parse
     tagstr-val
     flatten
     (partition 2)
     (save (str filename ".csv")))
    (println "Finished!")))

