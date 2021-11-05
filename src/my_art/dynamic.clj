(ns my-art.dynamic
  (:require [quil.core :as q]))

;; (def BAR-WIDTH 20)
;; (def LAST-BAR -1)

;; (defn setup []
;;   (q/frame-rate 30)
;;   (q/color-mode :hsb (q/width) (q/height) 100)
;;   ;; (apply q/background [20 20 70])
;;   (q/no-stroke))

;; (defn draw-state [state]
;;   (let [which-bar (/ (q/mouse-x) BAR-WIDTH)]
;;     (when (not= which-bar LAST-BAR)
;;       (let [bar-x (* which-bar BAR-WIDTH)] (q/fill bar-x (q/mouse-y) 66) (q/rect bar-x 0 BAR-WIDTH (q/height))))))

(defn setup []
  (q/background 255))

(defn draw-state [state]
  (q/stroke 0)
  (q/fill 255 0 0)
  (q/ellipse 25 25 50 50))