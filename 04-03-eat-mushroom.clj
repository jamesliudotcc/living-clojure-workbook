(defmulti eat-mushroom (fn [height]
                         (if (< height 3)
                           :grow
                           :shrink)))