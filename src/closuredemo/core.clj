(ns closuredemo.core (:gen-class))

;;Functions "defn, fn, HFO's", functions can take multiple arguments
(defn foo []
  (println  (str "Hello" "World"))

  ;;Operators "+, -, *, /, inc, dec, max, min, rem"
  (println (+ 1 2))

  ;;Relational "=, not=, <, <=, >, >="
  (println (= 1, 4))

  ;;Logical "and, or, not"

  ;;Loops "while(), doseq(), dotimes(), loop()"
  (dotimes [n 3]
    println ("hi"))

  ;;Decision "if(), if-do(), case, cond"
  (if (= 2 2)
    (do (println ("Yes")))
    (do (println ("No"))))

  ;;Declare a float
  (def x 1.25)
  (println (type x))

  ;;Declare a string
  (def x1 "test")

  ;;Declare a boolean
  (def x2 true)

  ;;Printing i five times
  (loop [i 0]
    (when (< i 5)
      (println (i))
      (recur (inc i))))

  ;;Reading contents of a whole file
  (def text1 (slurp "Example.txt"))

  ;;Reading content from a file one line at a time
  (with-open [rdr (clojure.java.io/reader "Example.txt")]
    (reduce conj [] (line-seq rdr)))

  ;;Writing to a file
  (spit "Example.txt" "This text")

  ;;Writing to a file one line at a time
  (with-open [w (clojure.java.io/writer "Example.txt" :append true)]
    (.write w (str "Hello" "World")))

  ;;Checking if file exists
  (println (.exists (clojure.java.io/file "Example.txt")))

  ;;Format string
  (format "Padding with zeros %06d" 1234)

  ;;Count number of characters
  (count "Hello")

  ;;List and vector
  (list 1 2 3 4)
  (vector 1 2 3 4)

  ;;Creating a hashmap
  (def key (hash-map "z" "2" "e" "5" "q" "8"))
  )

(foo)