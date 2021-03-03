package com.beuni.puppyadoption.util

import com.beuni.puppyadoption.R
import com.beuni.puppyadoption.model.DogData

class UtilData {

    companion object{

        fun getDogData()= mutableListOf<DogData>(
            DogData(
                age = "1 year",
                imageUrl = "https://dogtime.com/assets/uploads/2019/08/afador-mixed-dog-breed-pictures-1-1442x1328.jpg",
                bread = "Afador",
                description = "The Afador is a mixed breed dog–a cross between the Afghan Hound and Labrador Retriever dog breeds. Loyal, energetic, and affectionate, these pups inherited some of the best qualities from both of their parents.\n" +
                        "\n" +
                        "Afadors are also sometimes known as the Afghan Lab. You can find these mixed breed dogs in shelters and breed specific rescues, so remember to always adopt! Don’t shop if you’re looking to add an Afador to your home!",
                gender = "Male",
                name = "Rocky"
            ),
            DogData(
                age = "1 year",
                imageUrl = "https://dogtime.com/assets/uploads/gallery/american-foxhound-dog-breed-pictures/6-sit.jpg",
                bread = "American Foxhound",
                description = "Easygoing, sweet, kind, and loyal, the American Foxhound dog breed belongs to a way of life that has continued for more than two centuries, but they have the potential to be a modern-day companion as well.\n" +
                        "\n" +
                        "Although they’re purebred dogs, you may find American Foxhounds in shelters or in the care of rescue groups. If this is the breed for you, opt to adopt if possible!",
                gender = "Male",
                name = "Caster"
            ),

            DogData(
                age = "1.5 year",
                imageUrl = "https://dogtime.com/assets/uploads/gallery/beagle-dog-breed-pictures/6-fullbod3q.jpg",
                bread = "Beagle",
                description = "Small, compact, and hardy, Beagles are active companions for kids and adults alike. Canines of this dog breed are merry and fun loving, but being hounds, they can also be stubborn and require patient, creative training techniques.\n" +
                        "\n" +
                        "Their noses guide them through life, and they’re never happier than when following an interesting scent. Beagles originally were bred as scenthounds to track small game, mostly rabbits and hare. They’re still used for this purpose in many countries today, including the United States. But you’ll find plenty of these pups living as companion dogs and loving, furry family members.",
                gender = "Female",
                name = "Blacky"
            ),
            DogData(
                age = "1.2 year",
                imageUrl = "https://dogtime.com/assets/uploads/gallery/bordoodle-mixed-dog-breed-pictures/bordoodle-mixed-dog-breed-pictures-1.jpg",
                bread = "Bordoodle",
                description = "The Bordoodle is a mixed breed dog — a cross between the Border Collie and Poodle dog breeds. Friendly, playful, and intelligent, these pups inherited some of the best qualities from both of their parents.\n" +
                        "\n" +
                        "Bordoodles are also sometimes known as Borpoos and Borderpoos. You can find these mixed breed dogs in shelters and breed specific rescues, so remember to always adopt! Don’t shop if you’re looking to add a Bordoodle to your home!",
                gender = "Female",
                name = "Rio"
            ),

            DogData(
                age = "8 months",
                imageUrl = "https://dogtime.com/assets/uploads/gallery/dachshund-dog-breed-pictures/face-6_680-453.jpg",
                bread = "Dachshund",
                description = "Dachshunds are scent hound dogs bred to hunt badgers and other tunneling animals, rabbits, and foxes. Hunters even used packs of Dachshunds to trail wild boar. Today their versatility makes them excellent family companions, show dogs, and small-game hunters.\n" +
                        "\n" +
                        "But don’t let this pup fool you. Dogs of this breed might be, as legendary literary critic and humorous journalist H. L. Mencken said, “half a dog high and a dog and a half long,” but this small, drop-eared dog is tough enough to take on a badger. In fact, that’s how they got their name (Dachs meaning badger; hund meaning dog).",
                gender = "Male",
                name = "Tonny"
            ),
            DogData(
                age = "1.1 year",
                imageUrl = "https://dogtime.com/assets/uploads/gallery/hovawart-dog-breed-pictures/hovawart-dog-breed-pictures-7.jpg",
                bread = "Hovawart",
                description = "The Hovawart dog breed was developed in Germany as a guard dog, and they were also used for tracking. Today, this breed is a companion and family dog. But they also work in search and rescue and as guard dogs.\n" +
                        "\n" +
                        "Enthusiasts know that the breed’s name means “a guardian of estates” in German, and also call their pups “Hovies” for short. Although these are purebred dogs, you may still find them in shelters and rescues. Remember to adopt! Don’t shop if this is the breed for you.",
                gender = "Male",
                name = "Olia"
            ),

            DogData(
                age = "9 months",
                imageUrl = "https://dogtime.com/assets/uploads/2019/12/rottle-mixed-dog-breed-pictures-1.jpg",
                bread = "Rottle",
                description = "The Rottle is a mixed breed dog — a cross between the Rottweiler and Poodle dog breeds. Playful, intelligent, and eager to please, these pups inherited some of the best qualities from both of their parents.\n" +
                        "\n" +
                        "Rottles go by several names, including Rottipoo and Rottidoodle. Despite their unfortunate status as a designer breed, you may find these mixed breed dogs in shelters and breed specific rescues, so remember to adopt! Don’t shop!",
                gender = "Male",
                name = "Cooper"
            ),
            DogData(
                age = "1.2 year",
                imageUrl = "https://dogtime.com/assets/uploads/gallery/valley-bulldog-mixed-dog-breed-pictures/valley-bulldog-mixed-dog-breed-pictures-4.jpg",
                bread = "Valley Bulldog",
                description = "The Valley Bulldog is a mixed breed dog–a cross between the Boxer and English Bulldog breeds. Medium in size, active, and loyal, these pups inherited some of the best qualities from both of their parents\n" +
                        "\n" +
                        "Valley Bulldogs also go by the name Bull Boxer. Despite their unfortunate status as a designer breed, you can find these mixed pups in shelters and breed-specific rescues, so remember to adopt! Don’t shop!",
                gender = "Male",
                name = "Berlin"
            ),

        )

        fun getDrawableResource(name: String): Int {
            return when(name){
                "Afador"-> R.drawable.afador
                "American Foxhound"-> R.drawable.foxhound
                "Valley Bulldog"-> R.drawable.bulldog
                "Rottle"-> R.drawable.rottle
                "Hovawart"-> R.drawable.hovawart
                "Dachshund"-> R.drawable.dachshund
                "Bordoodle"-> R.drawable.bordoodle
                "Beagle"-> R.drawable.beagle
                else -> R.drawable.ic_launcher_background
            }
        }

    }

}