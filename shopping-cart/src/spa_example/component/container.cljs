
(ns spa-example.component.container
  (:require
    [respo.alias :refer [create-comp create-element div hr]]
    [respo.component.text :refer [comp-text]]
    [spa-example.actions :refer []]
    [spa-example.component.product-list :refer [comp-product-list]]
    [spa-example.component.cart :refer [comp-cart]]))

(defn h1 [props & children]
  (create-element :h1 props children))

(defn h2 [props & children]
  (create-element :h2 props children))

(defn render [store]
  (fn [state mutate!]
    (div {:attrs {:class-name "app"}}
      (h1 {} (comp-text "Shopping Cart Example" nil))
      (hr {})
      (h2 {} (comp-text "Products" nil))
      (comp-product-list store)
      (hr {})
      (comp-cart store))))

(def comp-container (create-comp :container render))
