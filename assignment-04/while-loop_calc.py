def main():
    count = 0
    total = 0.0
    values = []

    print("--- Enter 5 Floating-Point Values ---")

    # While-loop with a counter to prevent an endless loop
    while count < 5:
        try:
            entry = float(input(f"Enter value {count + 1}: "))
            total += entry
            values.append(entry)
            
            # Increment counter (this prevents the endless loop)
            count += 1
        except ValueError:
            print("Invalid input. Please enter a numeric floating-point value.")

    # Calculations
    average = total / 5
    maximum = max(values)
    minimum = min(values)
    interest = total * 0.20

    # Output Results
    print("\n--- Summary Results ---")
    print(f"Total:            {total:,.2f}")
    print(f"Average:          {average:,.2f}")
    print(f"Maximum:          {maximum:,.2f}")
    print(f"Minimum:          {minimum:,.2f}")
    print(f"Interest (20%):   {interest:,.2f}")

if __name__ == "__main__":
    main()