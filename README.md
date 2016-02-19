# xml-to-csv

A Clojure app to convert an XML file to
a two-column CSV file, with a concatenated string
of tags (separated by a pipe character)
in the left column and values in the
right column. Attributes are included and
their values are represented as Clojure hash-map
literals.

## Usage

Command line:

    java -jar /path/to/xml-to-csv-0.0.1-SNAPSHOT-standalone.jar /another/path/to/your-file.xml

## Warning

This is a training project by a beginner learning Clojure.
Use at your own risk!
