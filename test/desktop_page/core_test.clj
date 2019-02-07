(ns desktop-page.core-test
  (:require [clojure.test :refer :all]
            [desktop-page.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

;;This test is written by Vikram to check pull request in GitHub
(deftest addition
  (is (= 4 (+ 2 2))))

(defn welcome [msg]
  (str "Hello " msg))
(deftest string
  (testing "message"
    (is (= "Hello world" (welcome "World")))))

