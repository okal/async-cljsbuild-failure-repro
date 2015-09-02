(ns cljsinit.core-test
  (:require
   [cljs.test :refer-macros [deftest testing is async]]
   [cljsinit.core :as c]))

(deftest example-with-timeout
  (async done
         (js/setTimeout (fn []
                          (is true)
                          (done))
                        0)))
