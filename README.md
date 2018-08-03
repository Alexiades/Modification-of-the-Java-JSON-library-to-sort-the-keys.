# Library for order the fields in JSON

This Library is a modification of the original library JSON.Simple that let you order the fields that cames from an array or xml...

	Change the data structure: HasMap to LinkedHasMap

## Getting Started

You need to add the library to your project and the select in your IDE.

### Prerequisites

You need to download the library json-simple-order.jar and then add to the folder of lib in you project.


### Installing

1/Download the library json-simple-order.jar

2/Add to the folder Lib in your project

```
\src\main\java\Lib
```

3/In the case of Intellij, open the Project Structure > Project Settings > Libraries

	3.1/There press the simbol "+" and navagate to the folder path and select the json-simple-order.jar

4/add the import sentence to the class.

```
import org.json.simple.JSONObject;
```

## Running the tests

I add a little program example to test the library. In the follow steps I show the output of the program.

### Break down into end to end tests

1/Initial order of the array that we wants to parse in order into an JSON

```
	String[] header={"Name","Surname","Country","State","City", "Address","PostalCode"};
	String[] content={"Alex","Alexiades","Tazmania","Taz","DiabloCity", "Crazy Avenue","9999"};
```

2/Bad result of the maven json-simple librery example:

 2.1/Maven dependencie

```
	<dependencies>
		<dependency>
			<groupId>com.googlecode.json-simple</groupId>
			<artifactId>json-simple</artifactId>
			<version>1.1.1</version>
		</dependency>
	</dependencies>


```
 2.2/Result of JSON with the maven library

 ```
	{
	   "Address":"Crazy Avenue",
	   "State":"Taz",
	   "Country":"Tazmania",
	   "PostalCode":"9999",
	   "City":"DiabloCity",
	   "Surname":"Alexiades",
	   "Name":"Alex"
	}

```

3/Delete the maven dependencie and add the json-simple-order.jar

 2.2/Result of the JSON with the json-simple-order.jar library

```
{
   "Name":"Alex",
   "Surname":"Alexiades",
   "Country":"Tazmania",
   "State":"Taz",
   "City":"DiabloCity",
   "Address":"Crazy Avenue",
   "PostalCode":"9999"
}
```

## Built With

* [Java](https://maven.apache.org/) - Dependency Management

## Contributing

Please read [CONTRIBUTING.md] for details on our code of conduct, and the process for submitting pull requests to us.

## Authors

* **Alejandro Alexiades**

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Based in the Json-simple library : https://github.com/fangyidong/json-simple
