# xml-to-csv

A Clojure app to convert an XML file to
a two-column CSV file, with a concatenated string
of tags (separated by a pipe character)
in the left column and values in the
right column. Attributes are included and
their values are represented as Clojure hash-map
literals.

## Usage

A pre-compiled stand-alone JAR file can be downloaded
from http://1drv.ms/1Qqij8i.

Command line:

    java -jar /path/to/xml-to-csv-0.0.1-SNAPSHOT-standalone.jar /another/path/to/your-file.xml

## Warning

This is a training project by a beginner learning Clojure.
Use at your own risk!
