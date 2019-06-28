(def adjs ["normal"
           "too small"
           "too big"
           "is swimming"])

(defn alice-is [in out] ; pass in a vector to alice-is
  (if (empty? in) ; like js ternary, delimited by spaces: is in empty?
    out ; base case, returns out
    (alice-is ; recursive case
     (rest in)
     (conj out
           (str "Alice is " (first in)))))) ; like head/tail, here, we haven't
           ; it's still the orignal vector, so first is correct.

(alice-is adjs []) ; [] is the initial condition of out, empty vector