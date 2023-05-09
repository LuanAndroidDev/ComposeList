package com.luan.composelist.model

data class Beer(
    val id: Int,
    val name: String,
    val style: String,
    val imageURL: String
)

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
