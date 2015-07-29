(ns fizzbuzz.core
  (:gen-class))

(def my-test-cases [10 20 100])

(defn my-list [n] (range 2 n))

(defn is-multiple-of [x f] (and (= 0 (mod x f)) (not (= x f))))

(defn without-multiples-of [n list] (filter #(not (is-multiple-of % n)) list))

(defn primes 
  [n list]
  (if (>= n (count list)) list
      (primes (+ n 1) (without-multiples-of (nth list n) list))))

;(defn my-val [n] (primes 0 (my-list n)))

;; (defn run-test-cases
;;   (map my-val my-test-cases)
;; )

(defn -main
  [& args]
;  (println run-test-cases)
  (println (Integer/parseInt "12"))
  (println "on a new line")
)
  
  
