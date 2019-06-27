(defn toggle-grow [direction]
  (if (= direction :small) :big :small))

(defn oh-my [direction]
  (str "Oh My! You are growing " direction))

(defn surprise [direction]
  ((comp oh-my toggle-grow) direction))