# --- Grocery Bill Calculator (Python) ---

# 1. Prompt for coupon
try:
    coupon_input = input("Enter coupon amount as a decimal (e.g., .10): ")
    coupon = float(coupon_input)
except ValueError:
    coupon = 0  # Fallback to trigger the "Invalid" check below

# 2. Logic to ensure value is within bounds (0 to 1.0)
if coupon > 1.0 or coupon <= 0:
    coupon = 0.10
    print("Invalid entry. Coupon set to default 10%.")

# 3. Prompt for weekly bills
weekly_bills = []
for i in range(1, 5):
    bill = float(input(f"Enter grocery bill for Week {i}: "))
    weekly_bills.append(bill)

# 4. Calculations
monthly_total = sum(weekly_bills)
weekly_avg = monthly_total / 4

discounted_total = monthly_total * (1 - coupon)
discounted_avg = discounted_total / 4

# 5. Display Results
print("\n--- RESULTS WITHOUT COUPON ---")
print(f"Monthly Total:   ${monthly_total:.2f}")
print(f"Weekly Average:  ${weekly_avg:.2f}")

print(f"\n--- RESULTS WITH COUPON ({coupon:.0%} off) ---")
print(f"Monthly Total:   ${discounted_total:.2f}")
print(f"Weekly Average:  ${discounted_avg:.2f}")