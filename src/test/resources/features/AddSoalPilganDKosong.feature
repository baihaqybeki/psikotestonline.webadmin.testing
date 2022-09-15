
Feature: Add Soal Pilihan Ganda

  Scenario: Edit soal type modul pilihan ganda, soal kosong, opsi jawaban d kosong, kunci jawaban a
    When navigate dashboard page 1
    And click button task
    And click button modul
    And choose type modul pilihan ganda and click button yellow
    And select soal to be edited with click button green
    And replace kunci jawaban pilih to a and update soal
    And click button update
    Then appear popup invalid

