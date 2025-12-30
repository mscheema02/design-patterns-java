# Parking Management System – Design Patterns in Java

<video controls width="800">
  <source src="park/video/Video%20-%20Made%20with%20Clipchamp.mp4" type="video/mp4">
</video>

## Overview

This project implements a **parking management system** using a variety of classic software design patterns in **Java**.  It lets clients register and log in, book and manage parking spaces, and pay using different methods, while managers and a super manager oversee the system.  The goal is to demonstrate how patterns such as **Factory**, **Strategy**, **Decorator**, **Observer** and **Singleton** can be used together to build a modular, extensible application.

## Features

- **User registration and authentication** – Clients can register as students, faculty members, non‑faculty staff or visitors.  Each registration is validated and stored, and clients can log in to manage their parking.
- **Parking space booking and management** – After logging in, clients can check availability, book a parking space, cancel or extend a booking.  The system charges different rates depending on the user type and applies an optional early‑bird discount.
- **Multiple payment methods** – Clients can pay via debit card, credit card or mobile payments.  Each payment option uses a separate strategy so more methods can be added without changing the booking code.
- **Management tools** – A super manager can auto‑generate manager accounts with strong passwords, and managers can add or remove parking spaces and verify users.  The management team is a singleton to ensure there is only one administrative interface.
- **Real‑time monitoring** – Observers can register with the parking system to receive notifications whenever spaces are added, booked or released.  This makes it easy to build dashboards or monitoring tools.

## Project Structure

```text
park/
├── bin/                 # compiled class files
├── docs/
│   └── images/          # images used in this README
├── src/
│   └── park/            # Java source code
│       ├── MaintainUser.java         # manages the list of registered users
│       ├── Manager.java              # manager, super manager and management team classes (Singleton)
│       ├── ParkingGUI.java           # GUI for booking a parking space
│       ├── ParkingRate.java          # interface, decorator classes and concrete rates
│       ├── ParkingSystemSubject.java # observer subject, observer and parking space classes
│       ├── Parkingcharges.java       # GUI for calculating deposits and handling payments
│       ├── UserFactory.java          # factory for creating different client types
│       ├── paymentstrategy.java      # strategy interface for payment methods
│       └── ...                       # other supporting classes (users, GUI forms, tests)
└── RandoopTests/        # auto-generated regression tests
```


## Design Patterns

This system illustrates several core design patterns:

### Factory Pattern

The `UserFactory` class encapsulates the logic of creating different types of users (`Student`, `FacultyMember`, `NonFacultyStaff`, `Visitor`) based on a type string.  By calling `UserFactory.getInstance(type, email, password)`, the rest of the system remains unaware of the specific subclasses being instantiated.  A smaller factory (`ManagementAccountFactory`) does the same for manager accounts.

### Strategy Pattern

Payment methods are implemented using a strategy interface (`paymentstrategy`) with concrete strategies for **debit card**, **credit card** and **mobile payments**.  The `Parkingcharges` GUI chooses a strategy at run‑time according to the client’s selection.  This makes it easy to add new payment methods by adding new implementations of the strategy interface.

### Decorator Pattern

The system charges different parking rates for different user types.  The `ParkingRate` interface defines a `calculateRate()` method, with concrete implementations (`StudentRate`, `FacultyRate`, `StaffRate`, `VisitorRate`).  An abstract `ParkingRateDecorator` wraps another `ParkingRate` and can modify its behaviour.  The provided `EarlyBirdDecorator` currently forwards the call unchanged, but it establishes a structure where discounts or surcharges can be layered onto existing rates without modifying them.

### Observer Pattern

The `ParkingSystemSubject` interface defines an observer API (`registerObserver`, `removeObserver`, `notifyObservers`).  The concrete subject (`ParkingSystem`) maintains a list of parking spaces and notifies all observers whenever a space is added, booked or released.  Observers implement the `ParkingSpaceObserver` interface and receive updates with the current list of spaces; the included `ParkingSpaceMonitor` prints a summary of available spaces.  This decouples the core parking logic from monitoring tools and allows multiple observers to be attached.

### Singleton Pattern

Several classes enforce a single instance via the Singleton pattern:

- **`register`** – Provides a single registration service instance used by the `UserRegistration` GUI.
- **`SuperManager`** – Ensures there is only one super manager who can create manager accounts.
- **`ManagementTeam`** – Maintains a single management team that holds a list of managers and a `ParkingSystem` instance.

Using singletons avoids inconsistencies that could arise if multiple super managers or management teams were accidentally created.

## How to Run

1. **Prerequisites:** Ensure you have a JDK (Java Development Kit) installed (Java 8 or later).
2. **Compile the sources:** Navigate to the `park (1)/src` directory and compile the Java files.  For example:

   ```bash
   cd park\ \(1\)/src
   javac park/*.java
   
3. **Run the application:** The entry point for the GUI is the UserRegistration class. Run it using java from the compiled classes directory (or specify the classpath to src). For example:
   
   ```bash
   java park.UserRegistration
The GUI will open and allow you to register or log in. From there you can book parking spaces and explore the different payment options.
