# -*- coding: utf-8 -*-
# Generated by Django 1.11.4 on 2017-10-31 13:27
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Politic',
            fields=[
                ('id', models.IntegerField(primary_key=True, serialize=False, verbose_name='Идентификатор личности')),
                ('name', models.CharField(max_length=2048, verbose_name='Наименование личности')),
            ],
        ),
        migrations.CreateModel(
            name='Site',
            fields=[
                ('id', models.IntegerField(primary_key=True, serialize=False, verbose_name='Идентификатор сайта')),
                ('name', models.CharField(max_length=2048, verbose_name='Наименование сайта')),
            ],
        ),
    ]
