(ns transliteration.srp-test
  (:use clojure.test
        transliteration.srp))

(deftest general-letter-test
  (testing "Capital letter should remain capital"
    (is (= (transliterate "Београд") "Beograd")))
  (testing "Should work for multiple words"
    (is (= (transliterate "Црна Гора") "Crna Gora")))
  (testing "Should work with special letters"
    (is (= (transliterate "Новак Ђоковић") "Novak Đoković"))))

