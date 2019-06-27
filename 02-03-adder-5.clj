(defn adder [x y]
  (+ x y))

(def adder-5 (partial adder 5))