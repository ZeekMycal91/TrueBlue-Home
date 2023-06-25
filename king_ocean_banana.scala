object HomeImprovementService {
  def main(args: Array[String]): Unit = {
    println("Welcome to Home Improvement Service!")
  
    // Define the services and products
    val services = Seq("Kitchen Renovations", "Bathroom Renovations")
    val products = Seq("Cabinets", "Countertops", "Appliances", "Sinks", "Tiles")

    // Get customer's choice
    print("Please tell us what service or product do you need: ")
    val selection = scala.io.StdIn.readLine
    
    // Check the selection and inform the customer
    selection match {
      case service if services.contains(service) => println(s"We are a trusted provider of high-quality $service.")
      case product if products.contains(product) => println(s"We provide high-quality $product for your home improvement needs.")
      case _ => println("Sorry, we don't provide that service or product.")
    } 

    // Ask for rating
    print("How was your experience with us? (1-5): ")
    val rating = scala.io.StdIn.readInt
    rating match {
      case 1 | 2 => println("We are sorry that you had a bad experience. Please let us know how we can improve.")
      case 3 => println("We are glad that you were satisfied. We hope to see you again!")
      case 4 | 5 => println("We are delighted that you had a great experience. Please let your friends know about us!")
      case _ => println("Invalid rating.")
    }

    // Ask for contact information
    println("Please provide your contact information to receive any updates from us.")
    print("First Name: ")
    val firstName = scala.io.StdIn.readLine
    print("Last Name: ")
    val lastName = scala.io.StdIn.readLine
    print("Email Address: ")
    val email = scala.io.StdIn.readLine
    print("Phone Number: ")
    val phone = scala.io.StdIn.readLong

    println("Thank you for using our services! We will keep you updated on any new offers or news.")

  }

}