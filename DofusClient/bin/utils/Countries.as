// Action script...

// [Initial MovieClip Action of sprite 20555]
#initclip 76
if (!ank.utils.Countries)
{
    if (!ank)
    {
        _global.ank = new Object();
    } // end if
    if (!ank.utils)
    {
        _global.ank.utils = new Object();
    } // end if
    var _loc1 = (_global.ank.utils.Countries = function ()
    {
    }).prototype;
    ASSetPropFlags(_loc1, null, 1);
    (_global.ank.utils.Countries = function ()
    {
    }).COUNTRIES = {fr: {FR: "France", BE: "Belgique", CA: "Canada", CH: "Suisse", AF: "Afghanistan", ZA: "Afrique du Sud", AL: "Albanie", DZ: "Algérie", DE: "Allemagne", AD: "Andorre", AO: "Angola", AI: "Anguilla", AQ: "Antartique", AG: "Antigua et Barbuda", AN: "Antilles Néerlandaises", SA: "Arabie Saoudite", AR: "Argentine", AM: "Arménie", AW: "Aruba", AU: "Australie", AT: "Autriche", AZ: "Azerbaïdjan", BS: "Bahamas", BH: "Bahreïn", BD: "Bangladesh", BB: "Barbades", BZ: "Belize", BM: "Bermudes", BT: "Bhoutan", BY: "Biélorussie", BO: "Bolivie", BA: "Bosnie-Herzégovine", BW: "Botswana", BN: "Brunei Darussalam", BR: "Brésil", BG: "Bulgarie", BF: "Burkina Faso", BI: "Burundi", BJ: "Bénin", KH: "Cambodge", CM: "Cameroun", CV: "Cap Vert", CL: "Chili", CN: "Chine", CY: "Chypre", CO: "Colombie", KM: "Comores", CG: "Congo", CD: "Congo, République Dém.", KR: "Corée du sud", KP: "Corée, République de", CR: "Costa Rica", HR: "Croatie", CU: "Cuba", CI: "Côte d\'Ivoire", DK: "Danemark", DJ: "Djibouti", DM: "Dominique", EG: "Egypte", AE: "Emirats arabes unis", EC: "Equateur", ER: "Eritrée", ES: "Espagne", EE: "Estonie", ET: "Ethiopie", FI: "Finlande", GA: "Gabon", GM: "Gambie", GH: "Ghana", GI: "Gibraltar", GB: "Grande Bretagne", GL: "Groënland", GR: "Grèce", GP: "Guadeloupe", GU: "Guam", GT: "Guatemala", GN: "Guinée", GQ: "Guinée équatoriale", GW: "Guinée-Bissau", GY: "Guyane", GF: "Guyane française", GE: "Géorgie", GS: "Géorgie Sud & Iles Sandwich", HT: "Haïti", HN: "Honduras", HK: "Hong-Kong", HU: "Hongrie", CX: "Ile Christmas", RE: "Ile de la Réunion", MU: "Ile Maurice", NF: "Ile Norfolk", BV: "Iles Bouvet", KY: "Iles Caïmans", CC: "Iles Cocos-Keeling", CK: "Iles Cook", FJ: "Iles Fidji", FO: "Iles Féroé ", HM: "Iles Heard et Mc Donald", FK: "Iles Malouines", MP: "Iles Mariannes du nord", MH: "Iles Marshall", SB: "Iles Salomon", SJ: "Iles Svalbard et Jan Mayen", TC: "Iles Turks et Caicos", VI: "Iles Vierges américaines", VG: "Iles Vierges britanniques", IN: "Inde", ID: "Indonésie", IQ: "Irak", IR: "Iran", IE: "Irlande", IS: "Islande", IL: "Israël", IT: "Italie", JM: "Jamaïque", JP: "Japon", JO: "Jordanie", KZ: "Kazakhstan", KE: "Kenya", KG: "Kirghizistan", KI: "Kiribati", KW: "Koweït", GD: "La Grenade", LA: "Lao", LS: "Lesotho", LV: "Lettonie", LB: "Liban", LR: "Liberia", LI: "Liechtenstein", LT: "Lituanie", LU: "Luxembourg", LY: "Lybie", MO: "Macao", MK: "Macédoine", MG: "Madagascar", MY: "Malaisie", MW: "Malawi", MV: "Maldives", ML: "Mali", MT: "Malte", MA: "Maroc", MQ: "Martinique", MR: "Mauritanie", YT: "Mayotte", MX: "Mexique", FM: "Micronésie, États Fédérés de", MD: "Moldavie, République de", MC: "Monaco", MN: "Mongolie", MS: "Montserrat", MZ: "Mozambique", MM: "Myanmar", NA: "Namibie", NR: "Nauru", NI: "Nicaragua", NE: "Niger", NG: "Nigéria", NU: "Niue", NO: "Norvège", NC: "Nouvelle Calédonie", NZ: "Nouvelle Zélande", NP: "Népal", OM: "Oman", UG: "Ouganda", UZ: "Ouzbékistan", PK: "Pakistan", PW: "Palau", PA: "Panama", PG: "Papouasie-Nouvelle-Guinée", PY: "Paraguay", NL: "Pays-Bas", PH: "Philippines", PN: "Pitcairn", PL: "Pologne", PF: "Polynésie Française", PT: "Portugal", PR: "Puerto Rico", PE: "Pérou", QA: "Qatar", RO: "Roumanie", RU: "Russie", RW: "Rwanda", CF: "République Centrafricaine", DO: "République Dominicaine", CZ: "République Tchèque", EH: "Sahara occidental", SM: "Saint Marin", LC: "Sainte-Lucie", SV: "Salvador", WS: "Samoa (Indépendante)", AS: "Samoa Américaines", CS: "Serbie-et-Monténégro", SC: "Seychelles", SL: "Sierra Leone", SG: "Singapour", SK: "Slovaquie", SI: "Slovénie", SO: "Somalie", SD: "Soudan", LK: "Sri Lanka", KN: "St Kitts et Nevis", VC: "St Vincent et les Grenadines", PM: "St. Pierre et Miquelon", SH: "Ste Hélène", SR: "Surinam", SE: "Suède", SZ: "Swaziland", SY: "Syrie", ST: "Säo Tome et Prìncipe", SN: "Sénégal", TJ: "Tadjikistan", TZ: "Tanzanie", TW: "Taïwan", TD: "Tchad", TF: "Ter. FR du sud et antartique", IO: "Territoire indien britannique", TH: "Thaïlande", TP: "Timor Oriental", TG: "Togo", TK: "Tokelau", TO: "Tonga", TT: "Trinité-et-Tobago", TN: "Tunisie", TM: "Turkménistan", TR: "Turquie", TV: "Tuvalu", US: "USA", UM: "USA Minor Outlying Islands", UA: "Ukraine", UY: "Uruguay", VU: "Vanuatu", VA: "Vatican", VE: "Venezuela", VN: "Vietnam", WF: "Wallis-et-Futuna", YE: "Yémen", ZM: "Zambie", ZW: "Zimbabwe"}, en: {US: "USA", GB: "United Kingdom", CA: "Canada", JP: "Japan", KR: "Korea, Democratic People\'s Republic of", AF: "Afghanistan", AL: "Albania", DZ: "Algeria", AS: "American Samoa", AD: "Andorra", AO: "Angola", AI: "Anguilla", AQ: "Antarctica", AG: "Antigua and Barbuda", AR: "Argentina", AM: "Armenia", AW: "Aruba", AU: "Australia", AT: "Austria", AZ: "Azerbaijan", BS: "Bahamas", BH: "Bahrain", BD: "Bangladesh", BB: "Barbados", BY: "Belarus", BE: "Belgium", BZ: "Belize", BJ: "Benin", BM: "Bermuda", BT: "Bhutan", BO: "Bolivia", BA: "Bosnia and Herzegowina", BW: "Botswana", BV: "Bouvet Island", BR: "Brazil", IO: "British Indian Ocean Territory", BN: "Brunei Darussalam", BG: "Bulgaria", BF: "Burkina Faso", BI: "Burundi", KH: "Cambodia", CM: "Cameroon", CV: "Cape Verde", KY: "Cayman Islands", CF: "Central African Republic", TD: "Chad", CL: "Chile", CN: "China", CX: "Christmas Island", CC: "Cocos (Keeling) Islands", CO: "Colombia", KM: "Comoros", CG: "Congo", CD: "Congo, Democratic Republic", CK: "Cook Islands", CR: "Costa Rica", CI: "Cote d\'Ivoire", HR: "Croatia (Hrvatska)", CU: "Cuba", CY: "Cyprus", CZ: "Czech Republic", DK: "Denmark", DJ: "Djibouti", DM: "Dominica", DO: "Dominican Republic", TP: "East Timor", EC: "Ecuador", EG: "Egypt", SV: "El Salvador", GQ: "Equatorial Guinea", ER: "Eritrea", EE: "Estonia", ET: "Ethiopia", TF: "FR Southern and Antarctic Lands", FK: "Falkland Islands (Malvinas)", FO: "Faroe Islands", FJ: "Fiji", FI: "Finland", FR: "France", GF: "French Guiana", PF: "French Polynesia", GA: "Gabon", GM: "Gambia", GE: "Georgia", DE: "Germany", GH: "Ghana", GI: "Gibraltar", GR: "Greece", GL: "Greenland", GD: "Grenada", GP: "Guadeloupe", GU: "Guam", GT: "Guatemala", GN: "Guinea", GW: "Guinea-Bissau", GY: "Guyana", HT: "Haiti", HM: "Heard and Mc Donald Islands", VA: "Holy See (Vatican City State)", HN: "Honduras", HK: "Hong Kong", HU: "Hungary", IS: "Iceland", IN: "India", ID: "Indonesia", IR: "Iran (Islamic Republic of)", IQ: "Iraq", IE: "Ireland", IL: "Israel", IT: "Italy", JM: "Jamaica", JO: "Jordan", KZ: "Kazakhstan", KE: "Kenya", KI: "Kiribati", KP: "Korea, Republic of", KW: "Kuwait", KG: "Kyrgyzstan", LA: "Lao People\'s Democratic Republic", LV: "Latvia", LB: "Lebanon", LS: "Lesotho", LR: "Liberia", LY: "Libyan Arab Jamahiriya", LI: "Liechtenstein", LT: "Lithuania", LU: "Luxembourg", MO: "Macau", MK: "Macedonia, The Former Yugoslav Republic of", MG: "Madagascar", MW: "Malawi", MY: "Malaysia", MV: "Maldives", ML: "Mali", MT: "Malta", MH: "Marshall Islands", MQ: "Martinique", MR: "Mauritania", MU: "Mauritius", YT: "Mayotte", MX: "Mexico", FM: "Micronesia, Federated States of", MD: "Moldova, Republic of", MC: "Monaco", MN: "Mongolia", MS: "Montserrat", MA: "Morocco", MZ: "Mozambique", MM: "Myanmar", NA: "Namibia", NR: "Nauru", NP: "Nepal", NL: "Netherlands", AN: "Netherlands Antilles", NC: "New Caledonia", NZ: "New Zealand", NI: "Nicaragua", NE: "Niger", NG: "Nigeria", NU: "Niue", NF: "Norfolk Island", MP: "Northern Mariana Islands", NO: "Norway", OM: "Oman", PK: "Pakistan", PW: "Palau", PA: "Panama", PG: "Papua New Guinea", PY: "Paraguay", PE: "Peru", PH: "Philippines", PN: "Pitcairn", PL: "Poland", PT: "Portugal", PR: "Puerto Rico", QA: "Qatar", RE: "Reunion", RO: "Romania", RU: "Russian Federation", RW: "Rwanda", KN: "Saint Kitts and Nevis", LC: "Saint Lucia", VC: "Saint Vincent and the Grenadines", WS: "Samoa", SM: "San Marino", ST: "Sao Tome and Principe", SA: "Saudi Arabia", SN: "Senegal", CS: "Serbia and Montenegro", SC: "Seychelles", SL: "Sierra Leone", SG: "Singapore", SK: "Slovakia (Slovak Republic)", SI: "Slovenia", SB: "Solomon Islands", SO: "Somalia", ZA: "South Africa", GS: "South Georgia & Sandwich Islands", ES: "Spain", LK: "Sri Lanka", SH: "St. Helena", PM: "St. Pierre and Miquelon", SD: "Sudan", SR: "Suriname", SJ: "Svalbard and Jan Mayen Islands", SZ: "Swaziland", SE: "Sweden", CH: "Switzerland", SY: "Syrian Arab Republic", TW: "Taiwan, Province of China", TJ: "Tajikistan", TZ: "Tanzania, United Republic of", TH: "Thailand", TG: "Togo", TK: "Tokelau", TO: "Tonga", TT: "Trinidad and Tobago", TN: "Tunisia", TR: "Turkey", TM: "Turkmenistan", TC: "Turks and Caicos Islands", TV: "Tuvalu", UG: "Uganda", UA: "Ukraine", AE: "United Arab Emirates", UM: "United States Minor Outlying Islands", UY: "Uruguay", UZ: "Uzbekistan", VU: "Vanuatu", VE: "Venezuela", VN: "Viet Nam", VG: "Virgin Islands (British)", VI: "Virgin Islands (U.S.)", WF: "Wallis and Futuna Islands", EH: "Western Sahara", YE: "Yemen", ZM: "Zambia", ZW: "Zimbabwe"}, es: {ES: "España", MX: "México", AR: "Argentina", CL: "Chile", CO: "Colombia", VE: "Venezuela", PE: "Perú ", CR: "Costa Rica", AF: "Afganistán", ZA: "Africa del Sur", AL: "Albania", DE: "Alemania", AD: "Andorra", AO: "Angola", AI: "Anguila", AG: "Antigua y Barbuda", AN: "Antillas Neerlandesas", AQ: "Antártida", SA: "Arabia Saudí ", DZ: "Argelia", AM: "Armenia", AW: "Aruba", AU: "Australia", AT: "Austria", AZ: "Azerbaiyán", BS: "Bahamas", BH: "Bahréin", BD: "Bangladesh", BB: "Barbados", BZ: "Belice", BJ: "Benín", BM: "Bermudas", BT: "Bhután", BY: "Bielorusia", BO: "Bolivia", BA: "Bosnia y Hezegovina", BW: "Botsuana", BR: "Brasil", BN: "Brunéi", BG: "Bulgaria", BF: "Burkina Faso", BI: "Burundi", BE: "Bélgica", CV: "Cabo Verde", KH: "Camboya", CM: "Camerún", CA: "Canadá ", TD: "Chad", CN: "China", CY: "Chipre", KM: "Comoras", CG: "Congo", CD: "Congo, República Dem.", KP: "Corea del Norte", KR: "Corea del Sur", CI: "Costa de Marfil", HR: "Croacia", CU: "Cuba", DK: "Dinamarca", DJ: "Djibuti", DM: "Dominica", EC: "Ecuador", EG: "Egipto", SV: "El Salvador", AE: "Emiratos Árabes Unidos", ER: "Eritrea", SK: "Eslovaquia", SI: "Eslovenia", US: "Estados Unidos de América (EEUU)", EE: "Estonia", ET: "Etiopía", PH: "Filipinas", FI: "Finlandia", FR: "Francia", GA: "Gabón", GM: "Gambia", GE: "Georgia", GS: "Georgia Sur e Is. Sandwich", GH: "Ghana", GI: "Gibraltar", GB: "Gran Bretaña", GD: "Granada", GR: "Grecia", GL: "Groenlandia", GP: "Guadalupe", GU: "Guam", GT: "Guatemala", GN: "Guinea", GQ: "Guinea Ecuatorial", GW: "Guinea-Bissau", GY: "Guyana", GF: "Guyana Francesa", HT: "Haití ", HN: "Honduras", HK: "Hong Kong", HU: "Hungría", IN: "India", ID: "Indonesia", IQ: "Irak", IE: "Irlanda", IR: "Irán", BV: "Is. Bouvet", KY: "Is. Caimán", CX: "Is. Christmas", CC: "Is. Cocos", CK: "Is. Cook", FO: "Is. Feroe", FJ: "Is. Fidji", HM: "Is. Heard y McDonald", FK: "Is. Malvinas", MP: "Is. Marianas del Norte", MH: "Is. Marshall", SB: "Is. Salomón", SJ: "Is. Svalbard y Jan Mayen", TC: "Is. Turcas y Caicos", VG: "Is. Vírgenes Británicas", VI: "Is. Vírgenes EEUU", UM: "Is. menores alejadas EEUU", MU: "Isla Mauricio", NF: "Isla Norfolk", IS: "Islandia", IL: "Israel", IT: "Italia", JM: "Jamaica", JP: "Japón", JO: "Jordania", KZ: "Kazajstán", KE: "Kenia", KG: "Kirguistán", KI: "Kiribati", KW: "Kuwait", LA: "Laos", LS: "Lesotho", LV: "Letonia", LR: "Liberia", LY: "Libia", LI: "Liechtenstein", LT: "Lituania", LU: "Luxemburgo", LB: "Líbano", MO: "Macao", MK: "Macedonia", MG: "Madagascar", MY: "Malasia", MW: "Malawi", MV: "Maldivas", MT: "Malta", ML: "Malí ", MA: "Marruecos", MQ: "Martinica", MR: "Mauritania", YT: "Mayotte", FM: "Micronesia", MD: "Moldova", MN: "Mongolia", MS: "Montserrat", MZ: "Mozambique", MM: "Myanmar", MC: "Mónaco", NA: "Namibia", NR: "Nauru", NP: "Nepal", NI: "Nicaragua", NG: "Nigeria", NU: "Niue", NO: "Noruega", NC: "Nueva Caledonia", NZ: "Nueva Zelanda", NE: "Níger", OM: "Omán", PK: "Pakistán", PW: "Palaos", PA: "Panamá ", PG: "Papúa Nueva Guinea", PY: "Paraguay", NL: "Países Bajos", PN: "Pitcairn", PF: "Polinesia Francesa", PL: "Polonia", PT: "Portugal", PR: "Puerto Rico", QA: "Qatar", CF: "Rep. Centroafricana", CZ: "Rep. Checa", DO: "Rep. Dominicana", RE: "Reunión", RW: "Ruanda", RO: "Rumanía", RU: "Rusia", SM: "S. Marino", WS: "Samoa", AS: "Samoa Americana", KN: "San Cristóbal y Nieves", PM: "San Pedro y Miquelón", VC: "San Vicente y las Granadinas", LC: "Santa Lucía", SN: "Senegal", CS: "Serbia y Montenegro", SC: "Seychelles", SL: "Sierra Leona", SG: "Singapur", SY: "Siria", SO: "Somalia", LK: "Sri Lanka", SH: "Sta. Elena", ST: "Sto. Tomé y Príncipe", SZ: "Suazilandia", SD: "Sudán", SE: "Suecia", CH: "Suiza", SR: "Surinam", EH: "Sáhara Occidental", TH: "Tailandia", TW: "Taiwán", TZ: "Tanzania", TJ: "Tayikistán", IO: "Territorio Británico del Océano Índico", TF: "Territorios Australes Franceses", TP: "Timor Oriental", TG: "Togo", TK: "Tokelau", TO: "Tonga", TT: "Trinidad y Tobago", TM: "Turkmenistán", TR: "Turquía", TV: "Tuvalu", TN: "Túnez", UA: "Ucrania", UG: "Uganda", UY: "Uruguay", UZ: "Uzbekistán", VA: "Vaticano", VN: "Vietnam", VU: "Vunuatu", WF: "Wallis y Futuna", YE: "Yemen", ZM: "Zambia", ZW: "Zimbabue"}, de: {DE: "Deutschland", AT: "Osterreich", CH: "Schweiz", AF: "Afghanistan", EG: "Agypten", AL: "Albanien", DZ: "Algerien", AS: "Amerikanisch-Samoa", VI: "Amerikanische Jungferninseln", AD: "Andorra", AO: "Angola", AI: "Anguilla", AQ: "Antarktis", AG: "Antigua u. Barbuda", GQ: "Aquator. Guinea", AR: "Argentinien", AM: "Armenien", AW: "Aruba", AZ: "Aserbeidschan", ET: "Athiopien", AU: "Australien", BS: "Bahamas", BH: "Bahrain", BD: "Bangladesh", BB: "Barbados", BE: "Belgien", BZ: "Belize", BJ: "Benin", BM: "Bermuda", BT: "Bhutan", BO: "Bolivien", BA: "Bosnien", BW: "Botsuana", BV: "Bouvetinsel", BR: "Brasilien", VG: "Britische Jungferninseln", IO: "Britisches Territorium im Indischen Ozean", BN: "Brunei", BG: "Bulgarien", BF: "Burkina Faso", BI: "Burundi", CL: "Chile", CN: "China", CK: "Cookinseln", CR: "Costa Rica", CI: "Côte d´Ivoire (früher Elfenbeinküste)", CD: "Demokratische Republik Kongo", DJ: "Djibuti", DO: "Dom. Rep.", DM: "Dominica", DK: "Dänemark", EC: "Ecuador", SV: "El Salvador", ER: "Eritrea", EE: "Estland", FJ: "Fidschi-Inseln", FI: "Finnland", FR: "Frankreich", GF: "Französisch-Guyana", PF: "Französisch-Polynesien", TF: "Französische Süd- und Antarktisgebiete", FO: "Färöer", GA: "Gabun", GM: "Gambia", GE: "Georgien", GH: "Ghana", GI: "Gibraltar", GD: "Grenada", GR: "Griechenland", GB: "Großbrittanien", GL: "Grönland", GP: "Guadeloupe", GU: "Guam", GT: "Guatelmala", GN: "Guinea", GW: "Guinea-Bissau", GY: "Guyana", HT: "Haiti", HM: "Heard- und McDonald-Inseln", HN: "Honduras", HK: "Hong-Kong", IN: "Indien", ID: "Indonesien", IQ: "Irak", IR: "Iran", IE: "Irland", IS: "Island", IL: "Israel", IT: "Italien", JM: "Jamaika", JP: "Japan", YE: "Jemen", JO: "Jordanien", KY: "Kaimaninseln", KH: "Kambodscha", CM: "Kamerun", CA: "Kanada", CV: "Kap Verden", KZ: "Kasachstan", QA: "Katar", KE: "Kenia", KG: "Kirgistan", KI: "Kiribati", CC: "Kokosinseln", CO: "Kolumbien", KM: "Komoren", CG: "Kongo", HR: "Kroatien", CU: "Kuba", KW: "Kuwait", LA: "Laos", LS: "Leshoto", LV: "Lettland", LB: "Libanon", LR: "Liberia", LY: "Libyen", LI: "Liechtenstein", LT: "Litauen", LU: "Luxemburg", MO: "Macao", MG: "Madagaskar", MW: "Malawi", MY: "Malaysia", MV: "Malediven", ML: "Mali", MT: "Malta", FK: "Malwinen", MA: "Marokko", MH: "Marshall-Inseln", MQ: "Martinique", MR: "Mauretanien", MU: "Mauritius", YT: "Mayotte", MK: "Mazedonien", MX: "Mexiko", FM: "Mikronesien", MD: "Moldavien", MC: "Monaco", MN: "Mongolei", MS: "Montserrat", MZ: "Mosambik", MM: "Myanmar", NA: "Namibia", NR: "Nauru", NP: "Nepal", NC: "Neukaledonien", NZ: "Neuseeland", NI: "Nicaragua", NL: "Niederlande", AN: "Niederländischen Antillen", NE: "Niger", NG: "Nigeria", NU: "Niue", KP: "Nordkorea", NF: "Norfolkinsel", NO: "Norwegen", MP: "Nördlichen Marianen", OM: "Oman", PW: "Palau", PA: "Panama", PG: "Papua Neuguinea", PY: "Paraguay", PK: "Parkistan", PE: "Peru", PH: "Philippinen", PN: "Pitcairn", PL: "Polen", PT: "Portugal", PR: "Puerte-Rico", ZA: "Rep. Südafrika", RW: "Ruanda", RO: "Rumänien", RU: "Rußland", RE: "Réunion", EH: "Sahara", SB: "Salomonen", ZM: "Sambia", WS: "Samoa", SM: "San Marino", SA: "Saudi-Arabien", SE: "Schweden", SN: "Senegal", CS: "Serbien-Montenegro", SC: "Seychellen", SL: "Sierra Leone", ZW: "Simbabwe", SG: "Singapur", SK: "Slowakische Rep.", SI: "Slowenien", SO: "Somalia", ES: "Spanien", LK: "Sri Lanka", SH: "St. Helena", KN: "St. Kitts u. Nevis", LC: "St. Lucia", PM: "St. Pierre und Miquelon", VC: "St. Vincent", SD: "Sudan", SR: "Surinam", SJ: "Svalbard und Jan Mayen", SZ: "Swasiland", SY: "Syrien", ST: "São Tomé und Príncipe", GS: "Südgeorgien und die Sandwichinseln", KR: "Südkorea", TJ: "Tadschikistan", TW: "Taiwan", TZ: "Tanzania", TH: "Thailand", TP: "Timor", TG: "Togo", TK: "Tokelau", TO: "Tonga", TT: "Trinidad u. Tobago", TD: "Tschad", CZ: "Tschech. Rep.", TN: "Tunesien", TM: "Turkmenistan", TC: "Turks- und Caicosinseln", TV: "Tuvalu", TR: "Türkei", US: "USA", UM: "USA Minor Outlying Islands", UG: "Uganda", UA: "Ukraine", HU: "Ungarn", UY: "Uruguay", UZ: "Usbekistan", VU: "Vanuatu", VA: "Vatikanstadt", VE: "Venezuela", AE: "Verein.Arab.Emirate", VN: "Vietnam", WF: "Wallis und Futuna", CX: "Weihnachtsinsel", BY: "Weißrußland", CF: "Zentralafrik. Rep.", CY: "Zypern"}};
} // end if
#endinitclip
