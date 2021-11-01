package com.example.placesoftheworld

class DataFile {
    companion object{

        fun createDataSet(): ArrayList<PlaceData>{
            val list = ArrayList<PlaceData>()
            list.add(
                PlaceData(
                    "Paris",
                    "https://github.com/Seershika-Kakuru/places_images/blob/main/paris.jpg?raw=true",
                    "COUNTRY NAME: France\n\nPOPULATION: 2,175,601\n\nFAMOUS FOODS: Croissant, Escargots, Macarons, Jambon-beurre, Steak tartare,Onion soup\n\nFAMOUS TOURIST ATTRACTIONS: Eiffel Tower, Musée du Louvre, Cathédrale Notre-Dame de Paris, etc"


                )
            )
            list.add(
                PlaceData(
                    "Agra",
                    "https://github.com/Seershika-Kakuru/places_images/blob/main/taj_mahal.jpg?raw=true",
                    "COUNTRY NAME: India\n\nPOPULATION: 1.586 million (2011)\n\nFAMOUS FOODS: Petha, Paratha, Mughlai, Bhalla, Jalebi, etc\n\nFAMOUS TOURIST ATTRACTIONS: Taj Mahal, Agra Fort, Itmat-Ud-Daula, etc"
                )
            )

            list.add(
                PlaceData(
                    "Pisa",
                    "https://github.com/Seershika-Kakuru/places_images/blob/main/pisa.jpeg?raw=true",
                    "COUNTRY NAME: Italy\n\nPOPULATION: 91,104(2015)\n\nFAMOUS FOODS: Gnocchi, Lasagne, Fried Zucchini Flowers,Gelato, Tiramisu\n\nFAMOUS TOURIST ATTRACTIONS: Leaning Tower Of Pisa, Cathedral of Santa Maria Assunta,Baptistery,etc"
                )
            )
            list.add(
                PlaceData(
                    "New York",
                    "https://github.com/Seershika-Kakuru/places_images/blob/main/new%20york.jpg?raw=true",
                    "COUNTRY NAME: USA\n\nPOPULATION: 8.8 million\n\nFAMOUS FOODS: Bagel," +
                            "Dollar Slice," +
                            "A “BEC”," +
                            "Shack Burger," +
                            "Pastrami," +
                            "Hot Dog," +
                            "Cheeseburger," +
                            "Falafel," +
                            "Elote Callejeros," +
                            "Murray’s Melt," +
                            "Grilled Octopus," +
                            "New York Cheesecake\n\n"+
                            "FAMOUS TOURIST ATTRACTIONS: Statue Of Liberty,The National 9/11 Memorial & Museum,The Metropolitan Museum of Art," +
                            "Central Park, The Empire State Building, The Top Of The Rock, Brookyln Bridge, etc"

                )
            )
            list.add(
                PlaceData(
                    "Tokyo",
                    "https://github.com/Seershika-Kakuru/places_images/blob/main/tokyo.png?raw=true",
                    "COUNTRY NAME: Japan\n\n" + "POPULATION: 13.96 million (2021)\n\n" +
                            "FAMOUS FOODS: Edomae-zushi (Edo-style Sushi)," +
                            "Monjayaki," +
                            "Ramen," +
                            "Tempura (Battered and Deep-Fried Seafood and Vegetables)," +
                            "Unaju (Freshwater Eel over Rice)," +
                            "Tendon (Tempura Rice Bowl)," +
                            "Soba (Buckwheat Noodles)\n\n"+
                            "FAMOUS TOURIST ATTRACTIONS: Meiji Jingu Shrine," +
                            "Shinjuku Gyoen National Garden," +
                            "Yomiuri Land," +
                            "Asakusa," +
                            "Edo-Tokyo Museum"
                )
            )

            list.add(
                PlaceData(
                    "London",
                    "https://github.com/Seershika-Kakuru/places_images/blob/main/london.jpg?raw=true",
                    "COUNTRY NAME: England\n\nPOPULATION: 8.982 million(2019)\n\nFAMOUS FOODS: Fish & Chips.\n" +
                            "The English Breakfast," +
                            "Afternoon Tea," +
                            "Sunday Roast," +
                            "Bangers & Mash," +
                            "Pie & Mash," +
                            "Indian Food," +
                            "Cockles.\n\nFAMOUS TOURIST ATTRACTIONS: Tower of London," +
                            "Buckingham Palace," +
                            "London Eye," +
                            "St Paul's Cathedral," +
                            "Big Ben and the Houses of Parliament."
                )
            )
            list.add(
                PlaceData(
                    "Sydney",
                    "https://github.com/Seershika-Kakuru/places_images/blob/main/download.jpg?raw=true",
                    "COUNTRY NAME: Australia\n\nPOPULATION: 5.312 million(2019)\n\nFAMOUS FOODS: Barramundi," +
                            "Sydney rock oyster," +
                            "Australian prawns," +
                            "Avocado on toast," +
                            "Bacon and egg roll," +
                            "Lamington cake," +
                            "Potato cake," +
                            "Yellowfin tuna.\n\nFAMOUS TOURIST ATTRACTIONS: Sydney Opera House," +
                            "Bondi Beach," +
                            "Royal Botanic Garden Sydney," +
                            "Queen Victoria Building," +
                            "Sydney Harbour Bridge," +
                            "The Rocks," +
                            "Taronga Zoo," +
                            "Sydney Tower Eye."
                )
            )

            return list
        }
    }
}