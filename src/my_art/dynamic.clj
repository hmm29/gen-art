(ns my-art.dynamic
  (:require [quil.core :as q]))

; why is this invalid??? throws null pointer exception
;; (def centX (/ (q/width) 2))
;; (def centY (/ (q/height) 2))

(def centX 250)
(def centY 250)

(defn setup []
  (q/frame-rate 24)
  (q/smooth)
  (q/background 225)
  (q/stroke 0)
  (q/stroke-weight 1)
  (q/no-fill)
  {:diam 10})

(defn update-state [{:keys [diam] :as state}] ; destructure
  (if (<= diam 400) {:diam (+ diam 10)} {:diam diam}))

(defn draw-state [{:keys [diam] :as state}]
  (when (<= diam 400)
    ;; (q/background 180)
    (q/ellipse centX centY diam diam)))


;; (defn setup []
;;   (q/background 0) ; move setting background to setup, otherwise the state is overwritten
;;   (q/frame-rate 30)
;;   (q/stroke 255)
;;   (q/color-mode :hsb)
;;   {:x 0
;;    :y 0
;;    :scale 20})

;; (defn update-state [{:keys [x y scale] :as state}] ; destructure
;;   ;; height and width are functions you need to `(call)` to get the value
;;   {:x (if (>= x (q/width)) 0 (+ x scale)) ; fix if-statements
;;    :y (if (>= x (q/width)) (+ y scale) y) ; 'do' does something different than you think
;;    :scale scale}) ; no need to add 0

;; (defn draw-state [{:keys [x y scale] :as state}] ; destructure
;;   (if (>= y (q/height))
;;     (q/no-loop)
;;     (if (> (rand) 0.5)
;;       (q/line x y (+ x scale) (+ y scale))
;;       (q/line x (+ y scale) (+ x scale) y))))