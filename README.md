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
* [Riddle12](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle12.kt) - Getting a network error and you want to recover and show some default state.
* [Riddle13](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle13.kt) - You only want to observe changes of a value but don't care if the same value has been emitted consecutively.
* [Riddle14](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle14.kt) - Retry an operation for a number of times or until a valid error occurred.
* [Riddle15](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle15.kt) - You have two sources of your data (cache & network request). You want to subscribe to both right away and keep the emission order.
* **[Riddle16](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle16.kt) - Need to understand**
* [Riddle17](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle17.kt) - Reactive types are lazy by default. Hence you might also want to get the value upon the subscription and not execution time.Reactive types are lazy by default. Hence you might also want to get the value upon the subscription and not execution time.
* [Riddle18](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle18.kt) - You have multiple sources and want to get the data from either one and then be consistent and not switch between multiple sources.
* **[Riddle19](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle19.kt) - Need to understand**
* [Riddle20](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle20.kt) - There something you want to execute and in your UI you have multiple trigger points.
* [Riddle21](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle21.kt) - Sometimes you can't do everything reactively and need to break out of it.
* [Riddle22](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle22.kt) - Group related data while skipping over some of it.
* [Riddle23](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle23.kt) - You get some data from a bad source and know for sure it's of a certain type that you require.
* [Riddle24](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle24.kt) - Know how many emissions have been sent out.
* [Riddle25](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle25.kt) - Continue with data if the stream is empty.
* [Riddle26](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle26.kt) - Delay emission of events to simulate some indication.
* [Riddle27](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle27.kt) - Add some logging.
* [Riddle28](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle28.kt) - Add some logging.
* [Riddle29](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle29.kt) - Add some logging.
* [Riddle30](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle30.kt) - Add some logging.
* [Riddle31](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle31.kt) - You want to re-run a certain Observable a number of times.
* [Riddle32](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle32.kt) - You want to terminate the given reactive type and stop the operation.
* [Riddle33](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle33.kt) - You want to shift work to a particular **[Scheduler]**.
* [Riddle34](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle34.kt) - You want to shift work to a particular **[Scheduler]**.
* [Riddle35](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle35.kt) - You have a local cache and only want to hit the network if the cache misses.
* [Riddle36](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle36.kt) - You want the user-input to trigger a search request for the entered text but only when no changes have been made for a pre-determined time to avoid unnecessary requests.
* [Riddle37](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle37.kt) - You want to recover from an expected error and map them to a particular result.
* [Riddle100](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle100.kt) - Double click detection mechanism for a button.
* [Riddle101](https://github.com/surajsau/RxRiddles/blob/master/src/main/kotlin/com/vanniktech/rxriddles/Riddle101.kt) - You have some countdown functionality and want to display how many seconds are left.

# License

Copyright (C) 2018 Vanniktech - Niklas Baudy

Licensed under the Apache License, Version 2.0
