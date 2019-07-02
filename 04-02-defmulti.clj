(defmulti who-are-you class) ; call class on input

(defmethod who-are-you java.lang.String [input] ; pattern match 
; against the result of the function called from multimethod, i.e.
; (class input). Here, if (class input) returns java.lang.String,
; run  the function below.
  (str "String - who are you? " input))

(defmethod who-are-you clojure.lang.Keyword [input]
  (str "Keyword - who are you? " input))

(defmethod who-are-you java.lang.Long [input]
  (str "Number - who are you? " input))