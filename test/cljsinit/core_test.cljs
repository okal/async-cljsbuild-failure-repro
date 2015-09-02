(ns cljsinit.core-test
  (:require
   [cljs.test :refer-macros [deftest testing is async]]
   [cljsinit.core :as c]))

(deftest true-things-are-true
  (testing "This is bound to work"
    (is true)))

(deftest false-things-are-not
  (testing "This is bound to fail"
    (is false)))

(deftest async-things-are-what?
  ;; Comment this out to see the previous two tests run
  (testing "Let's wait and see"
    (async done
      (js/setTimeout
        (fn []
          (is true)
          (done))
        0))))

