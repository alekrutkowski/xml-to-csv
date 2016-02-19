(defproject xml-to-csv "0.0.1-SNAPSHOT"
  :description "XML file to CSV file converter"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.xml "0.0.8"]
                 [org.clojure/data.csv "0.1.3"]]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [xml-to-csv.core]
  :main xml-to-csv.core)
