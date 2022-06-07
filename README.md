# HelloWorldAndroid
Android開発入門：ボタンをタップすると表示テキストが切り替わるアプリ

# 学んだこと

### 画面構成部品
- activity_main.xml に部品を書く
- ViewBindingを使って、xmlの部品にアクセスする

例）

activity_main.xmlファイル中、
android:id="@+id/text_edit_view" 

ViewBindingを設定したbuild.gradleとSYNCすると、
`TextEditViewBinding`というクラスが自動生成される

kotlinでは、`binding.textEditView`でアクセスできる

- findViewByIdは古い
- R.id.~ は古い

### 文字列
- res/values/strings.xmlに書く
- kotlinファイルでは、getString(R.string.~)　で取得
- activity_main.xmlでは、"@string/~" で取得

### onCreate
```
super.onCreate(savedInstanceState)
binding = ActivityMainBinding.inflate(layoutInflater)
setContentView(binding.root)
```
をすると、layoutとlogicが共通の画面部品にbindされる

### binding.部品.setOnClickListener
bindされた画面部品のクリックイベントを捉えて、任意の処理を行う

処理の記述は、onCreate関数内に直接書くことも、分けて書くこともできる

直接）
```
binding.button.setOnClickListener{...}
```

分ける）
```
class MainActivity : AppCompatActivity(), View.OnClickListener {
  onCreate() {
    ...
    binding.button.setOnClickListener(this)
  }

  override fun onClick(v: View) {...} # 継承しているので、overrideがつく
}
```




