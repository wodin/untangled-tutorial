(ns app.i18n.en-US (:require untangled.i18n.core) (:import goog.module.ModuleManager))

;; This file was generated by untangled's i18n leiningen plugin.

(def translations {})

(swap!
 untangled.i18n.core/*loaded-translations*
 (fn [x] (assoc x "en-US" translations)))

(if
 (exists? js/i18nDevMode)
 :noop
 (-> goog.module.ModuleManager .getInstance (.setLoaded "en-US")))