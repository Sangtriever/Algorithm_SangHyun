SELECT B.BOOK_ID, A.AUTHOR_NAME, SUBSTRING(B.PUBLISHED_DATE,1,10) AS PUBLISHED_DATE
FROM BOOK B
INNER JOIN AUTHOR A
ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE B.CATEGORY = '경제'
ORDER BY B.PUBLISHED_DATE