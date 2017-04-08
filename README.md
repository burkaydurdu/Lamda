# Lamda [ JAVA 8 ]


Lamda anomin tekil görevler olarak değerlendirilir. Referans verilebilir. Lamda fonksiyonları referans verilen fonksiyon içinden tekil işlemlerde fazla kod yazmaktan kurtarıyor bizleri.

```
  protected float Area(float edge1 , float edge2, Transactions area){
        return area.AreaProc(edge1, edge2);
  }

```

Burada gördüğümüz Area fonksiyonu içerisinde bulunan 3. argüman bir interface referansı interfacede kural olarak tekil basit bir işlemi yapan 
fonksiyon tanımlanıyor.Bu fonksiyon alan hesabı yapıyor. Şekillere göre alan hesabınında değiştirileceği göz önünde bulundurursak fonksiyonun tek tanımı olmaması gerek override edilmesi gerek
işte tamda burada ``Lamda`` işin içine giriyor. Lamda olmadan tanımlarsak:

```
 float rectangle_a = Area(100, 50, new Transactions() {
      @Override
      public float AreaProc(float edge1, float edge2) {
           return edge1 * edge2;
      }
 });
```

Bu şekilde tanım gerekecekti. Lamda ile az kod ve temiz bir iş çıkarıyoruz.

```
 float square_a = Area(40,40, (edge1, edge2) -> edge1 * edge2 );

```

İşte bu kadar kolay ve hızlı fonksiyonel bir yapı sunuyor bizlere fonksiyonel dillerden esinlenerek oluşturulmuş bir yapidir.