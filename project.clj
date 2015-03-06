(defproject cljsinit "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2985"]]

  :plugins [[lein-cljsbuild "1.0.5"]]

  :source-paths ["src"]

  :cljsbuild {;; :test-commands {"ui" ["phantomjs" "phantom/unit-test.js" "phantom/unit-test.html"]}
              :builds [{:id "test"
                        :source-paths ["src" "test"]
                        :notify-command ["phantomjs" "phantom/unit-test.js" "phantom/unit-test.html"]
                        :compiler {:optimizations :whitespace
                                   :pretty-print true
                                   :output-to "target/testable.js"}}]})
