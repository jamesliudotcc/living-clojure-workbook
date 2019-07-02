(def adjs ["normal"
           "too small"
           "too big"
           "is swimming"])

(defn alice-is [input] ; instead of a vector, just the input
  (loop [in input ; recur jumps here
         out []] ; still need to define inital of acc
    (if (empty? in)
      out ; return
      (recur (rest in)
             (conj out
                   (str "Alice is a  ") (first in)))))

(alice-is adjs) ; no need to add accumulator

; TODO come back here, not totally understood