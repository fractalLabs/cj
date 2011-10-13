(ns cj.test.server
    (:use [cj.core])
    (:use [fm util])
    (:use [clojure.test]))

(deftest carga-todos
	  (is (false-on-exception carga-nss)))