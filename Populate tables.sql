 ## Populate artists
INSERT INTO public.artist(
	cod_artist, artist_name, country)
	VALUES (1, 'Metallica','US');
INSERT INTO public.artist(
	cod_artist, artist_name, country)
	VALUES (2, 'Iron Maiden','UK');
INSERT INTO public.artist(
	cod_artist, artist_name, country)
	VALUES (3, 'Angra','BR');

##Populate Companies
INSERT INTO public.company(
	cod_company, company_name, country)
	VALUES (1, 'Elektra Records', 'US');
INSERT INTO public.company(
	cod_company, company_name, country)
	VALUES (2, 'Sony Music Entertainment', 'JP');
INSERT INTO public.company(
	cod_company, company_name, country)
	VALUES (3, 'Blackened Recordings',


##Populate Categories
INSERT INTO public.category(
	cod_category, desc_category)
	VALUES (1, 'Heavy Metal');
INSERT INTO public.category(
	cod_category, desc_category)
	VALUES ('2', 'Power Metal');
INSERT INTO public.category(
	cod_category, desc_category)
	VALUES (3, 'Hard Rock');
INSERT INTO public.category(
	cod_category, desc_category)
	VALUES (4, 'Classic Rock');