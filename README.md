# resilienceej-chaosmonkey

# Watched Custom Services 
/actuator/chaosmonkey/assaults

# Prior to Spring Boot Chaos Monkey 2.0.1 version, if you enable service watcher (chaos.monkey.watcher.service: true), this configuration could be attacked all of the service classes. 
# From the 2.0.1 version, we can enable watcher on explicit classes/method level using watchedCustomServices property like below. 
{
"level": 2,
"latencyRangeStart": 1000,
"latencyRangeEnd": 2000,
"latencyActive": false,
"exceptionsActive": true,
"killApplicationActive": false,
  "watchedCustomServices" : 
  [ "com.snkit.resiliencechaosmonkey.HelloWorldService.sayHi"],
"exception": {
    "type": "java.lang.IllegalArgumentException",
    "arguments": [{
      "className": "java.lang.String",
      "value": "custom illegal argument exception"}] }
}












