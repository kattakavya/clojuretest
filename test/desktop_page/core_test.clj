(ns desktop-page.core-test
  (:require [clojure.test :refer :all]
            [desktop-page.core :refer :all]
            [clojure.test.check.generators :as gen]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (/ 0 1))))
(is (= 4 (+ 2 2)))

(def five (gen/choose 5 9))
(gen/sample five)

(deftest subtraction
  (is (= -8 (- 6 -2)))
 (is (= 8 (reduce + 1 [2 3]))
     ))
(is (= 9 (+ 7 2)))

(are [x y] (= x y)
  4(+ 2 2)
  21(* 7 3))

(do (is (= 2 (+ 1 1)))
    (is (= 10 (+ 4 6))))

;(is (thrown? ArithmeticException (/ 1 0)))


(is (= 5 (reduce + [1 3])))

(is (= #{1 2 3} (conj #{1 2} 4)))

(is (= #{:a :b :d} (set '(:a :a :b :b :c :c))))
