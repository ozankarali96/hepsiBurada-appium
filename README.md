
# Hepsiburada-Appium

Hepsiburada mobil uygulamasında üzerinde yapılan 2 farklı senaryo koşulmuştur. 
Senaryolar koşulurken framework olarak Java-Appium kullanılmıştır. Junit kütüphanesinden faydalanılmıştır. 

### Senaryo1
- Uygulama açılır.
- Anasayfada Konum alanına tıklanır.
- İl, ilçe ve mahalle seçilir ve kaydet butonuna tıklanır.
- Konumunuz Kaydedildi popup'ı kontrol edilir.
- Tab bar üzerinden kategori seçilip listeleme sayfasına yönlenilir.
- Listeleme sayfasından Yarın Kapında alanında gelen il bilgisi ile anasayfada seçilen il bilgisinin aynı olduğu kontrol edilir.

### Senaryo2 
- Uygulama açılır.
- Anasayfada Süper Fiyat, Süper Teklif’e tıklanır.
- Süper Fiyat, Süper Teklifsayfasından bir ürüne gidilir.(Birden fazla görseli olan ürün seçilir.)
- Ürün detayda ürünün görseline Kklanır ve yana doğru scroll edilir.
- Görsel ekranı kapatılır.
- Ürün detaydan favori butonuna basılır.
- Açılan login sayfasından login olunur ve login olunduğu kontrol edilir.
- Beğendiklerim sayfasına gidilip ürünün beğendiklerime eklendi görülür.




## Classlar
Page Object Pattern yapısına uygun yazılmıştır.

 ### Base
 #### BasePage
 Senaryoları koşarken gerekli olan methodlar yazılmıştır.
 #### BageTest
 Before after anotasyonları kullanımıştır. Before anatasyonu içinde android driver ayarları verilmiştir. After anatasyonu içinde senaryo bitiminde driver kapatılmıştır.
 
 ### Constants
 Sabitler burada tutulmuştur. Bu sabitler uygulama içinde bulunan locatorlerdir.

 ### Pages
 #### hepsiburadaScenario1
 Senaryo1 steplerini gerçekleştirdiğim alan
 #### hepsiburadaScenario2
 Senaryo2 steplerini gerçekleştirdiğim alan

### test.android
#### hpTest
Senaryolar için yazılmış steplerin arka arkaya sıraladığım alan.