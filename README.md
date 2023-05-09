# ComposeList
Projeto simples pra mostrar como a LazyList/LazyColumn funciona em Compose (nao existe mais RecyclerView).

## Passo 1: Criar os dados fakes pra mostrar na list

**ChatGPT**
me: I need the 20 objects in the list but all of them using random picsum placeholders.
Sure thing! Here's an example with 20 Beer objects using Picsum placeholders:

```
data class Beer(
    val id: Int,
    val name: String,
    val style: String,
    val imageURL: String
)
```

```
val beerList = listOf(
    Beer(1, "West Coast IPA", "IPA", "https://picsum.photos/200/300?random=1"),
    Beer(2, "Belgian Dubbel", "Dubbel", "https://picsum.photos/200/300?random=2"),
    Beer(3, "Irish Red Ale", "Red Ale", "https://picsum.photos/200/300?random=3"),
    Beer(4, "American Pale Ale", "Pale Ale", "https://picsum.photos/200/300?random=4"),
    Beer(5, "German Hefeweizen", "Hefeweizen", "https://picsum.photos/200/300?random=5"),
    Beer(6, "British Porter", "Porter", "https://picsum.photos/200/300?random=6"),
    Beer(7, "Belgian Tripel", "Tripel", "https://picsum.photos/200/300?random=7"),
    Beer(8, "Scottish Ale", "Scottish Ale", "https://picsum.photos/200/300?random=8"),
    Beer(9, "Czech Pilsner", "Pilsner", "https://picsum.photos/200/300?random=9"),
    Beer(10, "Russian Imperial Stout", "Stout", "https://picsum.photos/200/300?random=10"),
    Beer(11, "English Bitter", "Bitter", "https://picsum.photos/200/300?random=11"),
    Beer(12, "American Brown Ale", "Brown Ale", "https://picsum.photos/200/300?random=12"),
    Beer(13, "Belgian Saison", "Saison", "https://picsum.photos/200/300?random=13"),
    Beer(14, "German Dunkelweizen", "Dunkelweizen", "https://picsum.photos/200/300?random=14"),
    Beer(15, "Irish Dry Stout", "Stout", "https://picsum.photos/200/300?random=15"),
    Beer(16, "American Amber Ale", "Amber Ale", "https://picsum.photos/200/300?random=16"),
    Beer(17, "German Märzen", "Märzen", "https://picsum.photos/200/300?random=17"),
    Beer(18, "Belgian Quadrupel", "Quadrupel", "https://picsum.photos/200/300?random=18"),
    Beer(19, "English Mild Ale", "Mild Ale", "https://picsum.photos/200/300?random=19"),
    Beer(20, "American Wheat Ale", "Wheat Ale", "https://picsum.photos/200/300?random=20")
)
```
Crie um `Beer.Kt` para a data class `Beer` e a list `beerList`.

## Passo 2: Crie um project Compose vazio - o proprio Android Studio tem um template

![image](https://github.com/LuanAndroidDev/ComposeList/assets/122656864/79c9a857-a4c5-4ca6-8612-83777fe91453)

## Passo 3: Mude a funcao @composable de Greetings para essa ShowList() aqui:
```
@Composable
fun ShowList(beers: List<Beer>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
    ) {
        items(beers) { beer ->
            Card(modifier = Modifier.padding(8.dp)) {
                Column {
                    Image(
                        painter = rememberAsyncImagePainter(beer.imageURL),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(194.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = beer.name,
                        modifier = Modifier.padding(16.dp),
                        style = MaterialTheme.typography.headlineSmall
                    )
                }
            }
        }
    }
}
```

Tem outras mudancas pequenas que voce pode ver no repositorio do GitHub (permissao para acessar a internet, coil/image dependencia, Scaffold na MainActivity).
https://github.com/LuanAndroidDev/ComposeList


