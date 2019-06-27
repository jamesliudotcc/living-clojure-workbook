(defn grow [name direction]
  (if (= direction :small)
    (str name " is growing smaller")
    (str name " is growing larger")))
