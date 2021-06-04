# demo-thymeleaf

これはSpringMVC+Thymeleafの研修用です。


# Step1. SpringBoot環境を起動してみよう。
`DemoThymeleafApplication`を実行し、`http://localhost:8080/thymeleaf/animals`にアクセスしよう。
`ThymeleafDemoController.java`のメソッドが呼び出されて、`animals.html`の内容が表示されます。


# Step2. HTMLに書き直して、Thymeleafテンプレートとして動作するようにしよう。
`animals.html`を書き直して、コントローラから受け取った`animals`配列の内容を表示しよう。
