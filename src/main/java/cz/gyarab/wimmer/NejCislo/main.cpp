#include <iostream>
#include <string>
#include <vector>
#include <map>

//
static void SeberVstup(std::vector<__int64>& _Cisla)
{
	std::string Vstup;

	while (true)
	{
		std::getline(std::cin, Vstup);

		if (Vstup == "\\e")
			break;

		_Cisla.push_back(std::stoll(Vstup));
	}

	return;
};

//
static void ZjistiPocetCisel(const std::vector<__int64>& _Cisla, std::map<__int64, __int64>& _PoctyCisel)
{
	for (const __int64 JednoCislo : _Cisla)
	{
		if (!_PoctyCisel.count(JednoCislo))
			_PoctyCisel.emplace(JednoCislo, 1);
		else
			_PoctyCisel[JednoCislo]++;
	}

	return;
};

//
static void UrciNejcetnejsiCislo(const std::map<__int64, __int64>& _PoctyCisel, __int64& _NejCislo, __int64& _PocetTohoCisla)
{
	for (std::pair<__int64, __int64> JednoCislo : _PoctyCisel)
		if (JednoCislo.second > _PocetTohoCisla)
		{
			_NejCislo = JednoCislo.first;
			_PocetTohoCisla = JednoCislo.second;
		}

	return;
};

//
int main(void)
{
	std::vector<__int64> Cisla;
	std::map<__int64, __int64> PoctyCisel;
	__int64 NejCislo = NULL, PocetTohoCisla = NULL;
	
	SeberVstup(Cisla);
	ZjistiPocetCisel(Cisla, PoctyCisel);
	UrciNejcetnejsiCislo(PoctyCisel, NejCislo, PocetTohoCisla);

	std::cout << "Nej Cislo: " << NejCislo << " [" << PocetTohoCisla << " krat ve vstupu]";
	std::cin.get();

	return NULL;
};