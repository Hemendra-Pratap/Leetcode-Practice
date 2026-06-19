SELECT customer_number FROM Orders

GROUP BY customer_number -- Same customer ke saare orders ko ek group mein daal do
ORDER BY COUNT(*) DESC -- Jis customer ke sabse zyada orders hain usko upar le aao

LIMIT 1; -- Sirf top wala customer chahiye