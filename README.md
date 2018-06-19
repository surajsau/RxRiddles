RxRiddles
=========

### Use cases of Riddles

* [Riddle4](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle4.kt) - Some button that can toggle two states. For instance a switch between White & Dark theme.
* [Riddle5](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle5.kt) - Two input fields in a calculator that need to be summed up and the result should be updated every time one of the inputs change.
* [Riddle6](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle6.kt) - Execute two network requests in parallel and wait for each other and process the combined data.
* [Riddle7](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle7.kt) - You never want to show the same value twice.
* [Riddle8](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle8.kt) - Make an Observable "lazy" for some time. For instance, when wanting to postpone some UI action.
* [Riddle9](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle9.kt) - Cancel an Observable when something has happened. For instance, stop polling when the user has been logged out.
* [Riddle10](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle10.kt) - Get some user data and perform a network request with the user data and have both data accessible afterwards.
* [Riddle11](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle11.kt) - Handle the click of a button right away but prevent double clicking by not handling multiple click events within a given time window.


This repository contains some riddles for RxJava to help you learn and master RxJava. There is an [accompanying medium article](https://medium.com/@vanniktech/riddling-your-way-to-master-rxjava-145d5de99b55) that gives some more information.

Each riddle is in a single file with an accompanying unit test that will check your implementation. Next to the unit test, I have also put up my solution. Note that there are multiple ways to achieve and solve the riddles but usually there's a dedicated operator or function that I want to show you.

The riddles are not sorted in any real preference and I plan to keep it that way. Just start with whichever one you prefer. Riddles with numbers lower than 100 can be solved with a single operator while every other riddle requires multiple operators.

### Contributing

I'm very open to having some more riddles. Especially some complex common use cases. In case you want to contribute create an issue and let's talk.

I want every riddle to be unique and have as little duplication as possible while also having some actual real-world use case for each riddle in mind. Something you can relate to and hopefully use in your everyday life.

# License

Copyright (C) 2018 Vanniktech - Niklas Baudy

Licensed under the Apache License, Version 2.0
