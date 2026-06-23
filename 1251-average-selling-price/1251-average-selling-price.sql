-- Har product ka average selling price nikalna hai
SELECT
    p.product_id,

    -- Agar product kabhi sell nahi hua to 0 return karo
    IFNULL(

        -- Weighted average = total revenue / total units
        ROUND(
            SUM(p.price * u.units) / SUM(u.units),
            2
        ),

        -- Agar NULL aaye to 0 kar do
        0
    ) AS average_price

-- Sab products ko rakhna hai
FROM Prices p

-- Isliye LEFT JOIN use karenge
LEFT JOIN UnitsSold u

-- Same product hona chahiye
ON p.product_id = u.product_id

-- Aur sale us date range mein honi chahiye
AND u.purchase_date BETWEEN p.start_date AND p.end_date

-- Har product ka ek answer chahiye
GROUP BY p.product_id;