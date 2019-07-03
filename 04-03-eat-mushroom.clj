(defmulti eat-mushroom (fn [height]
                         (if (< height 3)
                           :grow
                           :shrink)))

(defmethod eat-mushroom :grow [_]
  "Eat the right side to grow.")

(defmethod eat-mushroom :shrink [_]
  "Eat the left side to shrink.")