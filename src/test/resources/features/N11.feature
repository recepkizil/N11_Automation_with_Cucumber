@smoke
Feature: N11 Web sitesine gitme
  @anasayfayaGit
  Scenario: N11 web sitesine gitmek istiyorum
    Given Kullanıcı anasayfaya gider
    When Ana sayfanın yüklendiğini doğrular
    And Kullanıcı ana sayfada "Giriş Yap" butonunu bulur ve tıklar
    And Giriş sayfasının yüklendiğini doğrular
    And Kullanıcı giriş sayfasında kullanıcı adı alanına geçerli bir kullanıcı adı girer
    And Kullanıcı giriş sayfasında şifre alanına geçerli bir şifre girer
    And Kullanıcı "Giriş Yap" butonuna tıklar
    And Kullanıcının hesabına başarıyla giriş yapıldığı doğrulanır

    @urunEkleme
    Scenario: Urun ekleme
      Given Kullanıcı anasayfaya gider
      When Ana sayfanın yüklendiğini doğrular
      And Kullanıcı ana sayfada "Giriş Yap" butonunu bulur ve tıklar
