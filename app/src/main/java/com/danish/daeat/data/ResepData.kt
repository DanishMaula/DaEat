package com.danish.daeat.data

object ResepData {
    private val nameFood = arrayOf(
        "Omelette",
        "Telur Orak Arik",
        "Avocado Toast",
        "Pancake Pisang",
        "Sandwich",
        "Onigiri",
        "Salad Sayur",
        "Salad Buah",
        "Smoothies",
        "Chicken Wrap"
    )

    private val description = arrayOf(
        "Variasi hidangan telur goreng yang disiapkan dengan cara mengocok telur dan menggorengnya dengan minyak goreng atau mentega panas di sebuah wajan.",
        "Makanan yang terbuat dari telur (biasanya telur ayam) diaduk atau dikocok bersama dalam wajan atau penggorengan saat dipanaskan dengan lembut, biasanya ditambahkan garam, mentega, dan bahan lainnya yang bervariasi.",
        "Avocado toast merupakan roti panggang beroles alpukat. Menu ini mengenyangkan sekaligus bernutrisi karena tinggi lemak sehat dan serat.",
        "Kue dadar yang dibuat dari terigu, telur ayam, gula dan susu. Bahan-bahan dicampur dengan air membentuk adonan kental yang digoreng di atas wajan datar yang diolesi sedikit minyak.",
        "Makanan yang biasanya terdiri dari sayuran, keju atau daging yang diiris, diletakkan di atas atau di antara irisan roti, atau lebih tepatnya makanan apa pun di mana dua atau lebih potongan roti berfungsi sebagai wadah atau pembungkus untuk jenis makanan lain.",
        "Salah satu jenis makanan tradisional Jepang yang setiap orang Jepang pasti pernah memakannya, berupa nasi yang dikepal dan dipadatkan.",
        "Makanan yang terdiri dari berbagai jenis sayuran yang dicampur dengan minyak zaitun dan mayonaise.",
        "Merupakan sejenis makanan yang terdiri dari campuran buah-buahan . Salad buah dikategorikan sebagai makanan sehat karena dari komposisinya yang terdiri dari buah-buahan kita dapat mengetahui bahwa salad buah adalah makanan yang banyak mengandung serat, nutrisi dan vitamin yang sangat bagus untuk menjaga kesehatan tubuh.",
        "Minuman kesehatan organik yang terbuat dari sayuran dan buah-buahan. Penampilannya menyerupai jus buah tetapi lebih kental seperti milk shake (susu kocok), karena tidak melalui proses penyaringan.",
        "Tumisan ayam dengan sayuran segar dibungkus roti tortilla bisa jadi camilan di sore hari atau buat isi kotak makan siang."
    )

    private val ingredients = arrayOf(
        "4 butir telur, pisahkan kuning dan putih telur\n1 sdt Royco Kaldu Ayam\n1 sdm margarin\n1 batang daun bawang, iris tipis",
        "2 butir telor ayam\n100 ml susu cair putih\nsesuai selera parutan keju\ngaram\nlada bubuk\n2 sdm mentega",
        "2 lembar roti tawar\n2 butir telur\n1 buah alpukat\n1 sdt perasan jeruk nipis\n1/2 sdt garam\n1/4 lada\n1 lembar keju\n1 sdm butter",
        "200 gram tepung terigu serbaguna\n2 buah pisang ambon yg matang sekali\n200 ml susu cair\n1 sdm gula pasir\n2 sdm butter/margarin leleh\n1/4 sdt garam\n1 sdt baking powder\n1 butir telur",
        "2 lembar roti tawar\n1 butir telur\n1 buah timun\nSecukupnya saus\n1 sdt margarin",
        "3 mangkuk Nasi Panas\n5 sdm Tuna Kaleng, sy pake SunBell in vegetable oil\n4 sdm Mayonaise, sy Maestro\n1 bungkus Nori Mamasuka, yg dipanggang dlm olive oil",
        "35 gr selada keriting\n35 gr kol merah\n60 gr lettuce\n2 buah timun kecil\n1 1/2 sdm minyak zaitun\n2 sdm air lemon\nSejumput garam\nSecukupnya Wijen",
        "1 buah apel\n1 buah peer\n1/4 buah naga\n1/4 melon\n1 buah Pisang\nMayonaise meastro\nSkm\nKeju\nYakult",
        "1 Buah Pisang Beku\n10 Buah Strawberry Beku\n1 Cup Yogurt Plain 80 ml (Me Biokul)\n1 Kotak Susu UHT Full Cream isi 250 ml (Boleh pakai 1/2nya aja)",
        "1/2 kg dada ayam\n3 buah paprika, iris memanjang\n1 buah bawang bombay, iris memanjang\nOlive oil\nTortilla\nMayonais\nSaus sambal"
    )
    private val instructions = arrayOf(
        "1. Pisahkan putih dan kuning telur di wadah yang berbeda.\n2. Taburkan lada hitam ke kuning telur secukupnya dan tambahkan 1 sdt Royco Kaldu Ayam.\n3. Kocok putih telur selama kurang lebih dua menit hingga mengembang. Pertahankan konsistensi mengocok agar hasilnya optimal.\n4. Kocok kuning telur dan pastikan agar tidak menggumpal.\n5. Campurkan putih telur bersama dengan kuning telur yang masing-masing telah dikocok. Aduk rata.\n6. Panaskan wajan dan 1 sdm margarin di atas api besar. Tuangkan telur ke dalam wajan dan ratakan seluruh permukaan.\n7. Taburkan daun bawang dan tutup wajan selama 10 detik. Matikan api dan sajikan omelet dalam bentuk setengah lingkaran.",
        "1. Kocok telur bersama garam/royko, & lada hingga merata\n2. Masukan parutan keju cheddar dalam mangkuk, aduk kembali hingga merata\n3. Panaskan mentega hingga mencair di atas teflon dengan api sedang hingga leleh\n4. Lalu masukan telur dan aduk telur hingga membuat gumpalan seperti di foto\n5. Lalu masukan susu cair, aduk sebentar & diamkan hingga susu meresap ke dalam telur\n6. Scrambled egg siap disajikan",
        "1. Pilih alpukat yang sudah matang sempurna, kerok dan haluskan, beri perasan jeruk nipis, garam dan lada.\n2. Panaskan teflon, lelehkan 1/2 SDM butter, masak roti tingga keemasan di ke dua sisinya. Sisihkan.\n3. Lanjut Masak telur hingga tingkat kematangan yang disukai.\n4. Oleskan alpukat di atas roti, kemudian beri 1/2 bagian keju slice kemudian tata telur di atasnya. Bole beri sedikit cabe bubuk jika suka.",
        "1. Kocok lepas telur,tambahkan pisang halus,susu cair,garam dan butter leleh,aduk rata,sisihkan.\n2. Dalam wadah terpisah campur bahan kering,terigu,gula pasir dan baking powder,aduk rata\n3. Tuang adonan pisang dan susu kedalan adonan kering,aduk perlahan sampai tercampur rata.\n4. Panaskan wajan datar,tuang 1 sendok sayur,tunggu sampai bagian bawah pancake berwarna coklat baru balik dan masak sampai matang,angkat.Lakukan sampai habis dan banana pancake siap disajikan dg berbagai topping sesuai selera.",
        "1. Siapkan semua bahan\n2. Panggang rotinya gk usah pake margarin ya\n3. Lalu masak telur,lalu iris tipis timun\n4. Taro 1 lembar roti di atas piring lalu tata timun,saus,telur,saus,timun lagi lalu 1 lembar roti lagi,Sandwich siap di hidangkan",
        "1. Ambil tuna dari kalengnya, minyaknya ga usah ikut. Campur tuna dengan mayo. Sisihkan.\n2. Ambil sekepal nasi lalu pipihkan. Letakkan 1sdm tuna mayo di atasnya. Tutup lalu bentuk segitiga agak pipih.\n3. Letakkan nori di bagian bawah.",
        "1. Cuci bersih sayuran di air mengalir kemudian bilas dengan air matang\n2. Iris tipis kol dan timun sesuai selera. Cabik - cabik selada dan lettuce. Campur dalam wadah. Tambahkan bahan lain aduk rata. Siap disajikan",
        "1. Iris2 buah2an semua sesuai selera\n2. Masukan yakult, mayonaise, skm sesuai selera, diaduk2, baru masukan buah2an. Dan keju parut sbg toping.",
        "1. Siapkan Bahan Bahan\n2. Masukkan semua bahan kedalam Blender, lalu blender hingga halus.\n3. Tuang kedalam gelas, smoties siap disajikan. Selesai",
        "1. Cuci dan belah dada ayam menjadi 2 bagian tipis, keringkan dengan paper towel. Balurkan secara merata bumbu pada ayam, marinasi.\n2. Panaskan olive oil, masak ayam hingga matang. Angkat, iris memanjang.\n3. Panaskan olive oil, tumis bawang bombay hingga layu. Masukkan paprika, tambahkan bumbu, aduk selama beberapa menit. Matikan api.\n4.Sajikan sebagai wrap dengan tortilla, mayonais, saus sambal, dan scrambled egg. Panggang wrap di toaster atau skillet. Sajikan. "
    )

    private val photo = arrayOf(
        "https://i.ibb.co/CvkLFx9/img-b-1.jpg",
        "https://i.ibb.co/X3nTSHB/download.jpg",
        "https://i.ibb.co/0f0x0pp/Avocado-Toast-With-Egg-13-copy.jpg",
        "https://i.ibb.co/0tyWPMP/a1d996787de27907f4320c1796672509.jpg",
        "https://i.ibb.co/d4RyCPC/342116610.jpg",
        "https://i.ibb.co/JkMd6Xx/onigiri-750x440.jpg",
        "https://i.ibb.co/Fq4hJc7/Resep-Salad-Sayur.jpg",
        "https://i.ibb.co/XVry6hF/3007504026.jpg",
        "https://i.ibb.co/xzfV5QF/download-1.jpg",
        "https://i.ibb.co/Bc2KYyp/download-2.jpg"
    )


    val listFood: ArrayList<Recipe>
        get(){
            val listBreakfast = arrayListOf<Recipe>()
            for (position in nameFood.indices){
                val recipes = Recipe(
                    name = nameFood[position],
                    description = description[position],
                    ingredients = ingredients[position],
                    instructions = instructions[position],
                    photo = photo[position],
                )
                listBreakfast.add(recipes)
            }
            return listBreakfast
        }
}