(ns test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [cljsinit.core-test]))


(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
        (run-tests
          'cljsinit.core-test))
    0
    1))
