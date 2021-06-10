# demo-thymeleaf

これはSpringMVC+Thymeleafの研修用です。


# Step1. SpringBoot環境を起動してみよう。

`DemoApplication`を実行し、`http://localhost:8080/zoo/animals`にアクセスしよう。

`AnimalsController.java`のメソッドが呼び出されて、`animals.html`の内容が表示されます。


# Step2. HTMLに書き直して、Thymeleafテンプレートとして動作するようにしよう。
`animals.html`を書き直して、コントローラから受け取った`animals`配列の内容を表示しよう。

# Step3. 新しいControllerを作ろう。

動物リストからランダムに１つ選んで表示するControllerを作成しよう。

AnimalsControllerに動物追加機能を追加しよう。

# Step4. AnimalServiceをDBから取得しよう。
MyBatisでMapper、XMLを実装しよう。

AnimalServiceImplを実装し、Daoを使おう。

AnimalService BeanをAnimalServiceImplに変更しよう。

DB接続先にはspring.datasource.url=jdbc:sqlite:./zoo.dbを使用すること。
※動物テーブルが定義済み。


# Step5. AnimalServiceでCacheを使う。

動物リストをキャッシュするようにしよう。

@Cacheableを付与したメソッドが呼ばれていないことを確認するため、ログ出力を追加しよう。

動物追加機能を呼び出した後、動物リストに反映されないことを確認しよう。

反映されていないことを確認したら、反映されるように改修しよう。
